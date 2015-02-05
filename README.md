# Asistente de voz Icaro

Icaro es un asistente de voz para dispositivos Android (Version 4 en adelante).
Cuenta con una serie de funcionalidades descritas a continuacion junto con comandos de voz para ejecutarlos.

Este proyecto consta de dos partes:
- La aplicacion Icaro para Android.
- El interprete que se encarga de parsear los comandos de voz a ejecutar.

> Para ayudar en el proyecto del interprete, enviame un [Mail].
> Para compilar la aplicacion Android, el Engine viene incluido (sin su archivo fuente).

### Version
1.0 Dev-0

### Tech

Estos son los elementos que se compone Icaro

* [ANTLR] - Version 4.5
* Android Studio - Puedes descargarlo desde [aca](https://developer.android.com/sdk/installing/studio.html).

### Installation

En una terminal

```sh
$ cd /path/to/directory/
$ git clone git@github.com:Miguelost/Icaro.git
```

### Compilacion
Para compilar y ejecutar el proyecto, hay que proveer a la aplicacion de una serie de claves.

###### World Wheater Online
- Para la funcionalidad hora, necesitas obtener una "API KEY" desde el servicio [World Weather Online] (http://www.worldweatheronline.com)
- Obtenida la Api Key, esta debe ser escrita en un archivo llamado "key_world_weather_online.txt".
- Finalmente dicho archivo debe incluirse en la carpeta ...res/raw del proyecto Android.

### Development

Si quieres ayudar en el desarrollo de Icaro, haz un branch y realiza pull request.

### Funciones y Frases Actuales

######Reloj
- Cual es la hora
- Dime la hora
- Necesito la Hora
- Dame la Hora
- Dime la hora en Milan
- Que hora es en Madrid
- Que Hora es

License
----

**Para que tener un Google Now, si podemos construir uno!**

[ANTLR]:http://www.antlr.org/
[@Miguelost]:http://twitter.com/Miguelost
[Mail]:miguel.zapatae@gmail.com
[Github]:https://github.com/Miguelost
