# **practica-de-html**
En este pequeño proyecto aprende usar git con archivos de html, css y java.

###   objectivos del projecto:

- apreder los diferentes comandos de git.

- como usar las ramas, merge y los repositorios remotos de github.

- aprender los flujos de trabajos de git y github para proyectos coperativos.
- aprender un poco de html.
  
## comandos basicos
```git
git init(crea un repositorio de git)

git add (agrega una archivo al repositorio de git)

git commit -m "mensaje"

git reset --hard

git branch nombre_de_la_rama(crea una rama nueva)

git checkout "nombre de la rama"(te mueves entre las ramas existentes)

git merge "nombre_de_la_rama
```

## **Cómo generar tus llaves SSH**
1. Generar tus llaves SSH**
Recuerda que es muy buena idea proteger tu llave privada con una contraseña.

```
ssh-keygen -t rsa -b 4096 -C "tu@email.com"
```

## nuevos comandos
```git
git log --all --graph --decorate --oneline
```
este sirve para ver el recorrido de tu repositorio

## **tags**
Los tags o etiquetas nos permiten asignar versiones a los commits con cambios más importantes o significativos de nuestro proyecto.

## Comandos para trabajar con etiquetas:
```
Crear un nuevo tag y asignarlo a un commit: git tag -a nombre-del-tag id-del-commit.

Borrar un tag en el repositorio local: git tag -d nombre-del-tag.

Listar los tags de nuestro repositorio local: git tag o git show-ref --tags.

Publicar un tag en el repositorio remoto: git push origin --tags.
```
## **Comandos para manejo de ramas en GitHub**
```
Crear una rama: git branch 

Movernos a otra rama: git checkout branchName

Crear una rama en el repositorio local: git branch nombre-de-la-rama o git checkout -b nombre-de-la-rama.

Publicar una rama local al repositorio remoto:git push origin nombre-de-la-rama.
```
Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.
## desarrollador
[Clon54programer](github.com/clon54programer)