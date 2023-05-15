# GitHub

Los sistemas de control de versiones son programas que tienen como objetivo controlar los
cambios en el desarrollo de cualquier tipo de software, permitiendo conocer el estado actual de
un proyecto, los cambios que se le han realizado a cualquiera de sus piezas, las personas que
intervinieron en ellos, etc. El software de control de versiones realiza un seguimiento de todas las
modificaciones en el código en un tipo especial de base de datos. Si se comete un error, los
desarrolladores pueden ir atrás en el tiempo y comparar las versiones anteriores del código para
ayudar a resolver el error al tiempo que se minimizan las interrupciones para todos los miembros
del equipo.

Volver al principio del repositorio. [FullSTack_Egg](https://github.com/megagringa/FullStack_Egg_Curso)

Comandos git:
```
//Al abrir la terminal.
//y Escribimos:





git --version          //muestra la versión que tenes instalada. 
git -v

git --help             //muestra los comandos de git
git -h 

ls                     //muestra ruta de carpetas

cd nombre_de_ruta      //ir a tal carpeta o ruta
cd ..                  //volver a la carpeta o ruta

pwd                    //posición de la ruta o carpeta en donde estamos.

mkdir "Nombre"         //Crea un directorio

clear                  //Limpia la consola

git config --global user.name "Nombre_de_usuario"  //Configura git globalmente en tu equipo con tu nombre
git config --gloabal user.email "Email"            //Configura git globalmente en tu equipo con tu email 

touch nombre_de_fichero       //Crea un fichero

git init                      //Crea un nuevo repositorio de Git
git status                    //Muestra el estado del directorio de trabajo y del área del entorno de ensayo
git add nombre_de_archivo     //Añade un cambio del directorio de trabajo en el entorno de ensayo 
git commit                    //Confirmar una instantánea del directorio del entorno de ensayo en el historial de confirmaciones de los repositorios
git commit -m "Texto"         //Confirma y agrega un mensaje en el commit
git log                       //Explora el historial del repositorio
git checkout                  //Te permite desplazarte entre las ramas creadas por git branch 
git reset                     //Deshacer los cambios locales en el estado de un repositorio de Git
git tag                       //Es el impulsor principal de una etiqueta: creación, modificación y eliminación.
git stash                     //Almacena temporalmente (o guarda en un stash) los cambios que hayas efectuado en el código en el que estás trabajando para que puedas trabajar en otra cosa y, más tarde, regresar y volver a aplicar los cambios más tarde.
```