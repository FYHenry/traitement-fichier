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
|->id = "tt[digit]{7}"
|
|->pays
|  |
|  |->nom = enum("[alpha]*") 
|  |
|  |->url = "/search/title/?country_of_origin=[alpha]{2}&ref=[alphanum]*"
|
|->nom = "[alpha]*"
|
|->url = "title/"${racine.id}"/\?ref=[alphanum]"
|
|->plot = "[alpha]*"
|
|->langue = "[alpha]*"
|
|->lieuTournage = "" (nullable)
|
|->realisateurs[]
|  |
|  |->identite = "[alpha]*"
|  |
|  |->url = "/name/nm[digit]{7}/?ref_=[alphanum]"
|
|->castingPrincipal[]
|  |
|  |->id = "nm[digit]{7}"
|  |
|  |->identite = "[alpha]*"
|  |
|  |->naissance[]
|  |  |
|  |  |->dateNaissance = "[digit]{4}-[digit]{1,2}-[digit]{2}"
|  |  |
|  |  |->lieuNaissance = "[alpha]*"
|  |
|  |->url = "/name/nm[digit]{7}/?ref_=[alphanum]"
|  |
|  |->height = (nullable)
|  |
|  |->roles[]
|
|->anneeSortie = "[digit]{4}" (nullable)
|
|->roles[]
|  |
|  |->characterName = "[alpha]*"
|  |
|  |->acteur[] = ${racine.castingPrincipal[]}
|  |
|  |->film = ${racine.id}
|
|->genres[] = ["[alpha]*"]
```

### Modélisation

On commence à construire un modèle conceptuel de données pour traduire les
données brutes.