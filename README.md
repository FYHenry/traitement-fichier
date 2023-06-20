# traitement-fichier
## Projet Internet Movie DataBase

### Données brutes

Ça se regroupe en un fichier JSON.
On identifie les objets, leur arboressence et leurs valeurs génériques.

Les chaînes de caractère sont notées en expressions régulières.
Les listes sont suffixées par `[]`.

```
racine[]
|
|->id = "tt[[digit]]{7}"
|
|->pays
|  |
|  |->nom = ${enum("[[alpha]]*")} 
|  |
|  |->url = "/search/title/\?country_of_origin="
|           ${enum("[[alpha]]{2}")}"&ref_=tt_dt_cn"
|
|->nom = "[[alpha]]*"
|
|->url = "/title/"${racine.id}"/\?ref_=nm_flmg_act_[[digit]]"
|
|->plot = "[[alpha]]*"
|
|->langue = "[[alpha]]*"
|
|->lieuTournage = "" (nullable)
|
|->realisateurs[]
|  |
|  |->identite = "[[alpha]]*"
|  |
|  |->url = "/name/nm[[digit]]{7}/\?ref_=tt_ov_dr
|           |"${racine.pays.url}
|
|->castingPrincipal[]
|  |
|  |->id = "nm[[digit]]{7,8}"
|  |
|  |->identite = "[[alpha]]*"
|  |
|  |->naissance[]
|  |  |
|  |  |->dateNaissance = "[[digit]]{4}-[[digit]]{1,2}-[[digit]]{2}"
|  |  |
|  |  |->lieuNaissance = "[[alpha]]*"
|  |
|  |->url = "/name/nm[[digit]]{7,8}/\?ref_=tt_ov_st"
|  |
|  |->height = null
|  |
|  |->roles[] = []
|
|->anneeSortie = "[[digit]]{4}" (nullable)
|
|->roles[]
|  |
|  |->characterName = "[[alpha]]*"
|  |
|  |->acteur[] = ${racine.castingPrincipal[]}
|  |  |
|  |  |->url = /name/nm[[digit]]{7,8}\?ref_=tt_cl_t_[[digit]]*
|  |
|  |->film = ${racine.id}
|
|->genres[] = [${enum("[[alpha]]*")}]
```

Les films sont identifiés via `"tt[[digit]]{7}"` alors que que les individus
sont identifiés par `"nm[[digit]]{7}"`.

### Modélisation

On commence à construire un modèle conceptuel de données pour traduire les
données brutes.