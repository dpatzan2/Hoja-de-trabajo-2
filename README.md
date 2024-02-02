# 🚀 Calculadora Postfix

¡Bienvenido a la Calculadora Postfix! Este programa evalúa expresiones en notación postfix y produce resultados fascinantes. ✨

## Estructura del Proyecto

El proyecto está organizado en varias carpetas y archivos que trabajan armoniosamente para ofrecer una experiencia de cálculo sublime.

### 📁 src

- **/model**: Aquí se manipulan los datos. Contiene las clases `Vector` y `Stack`, que permiten el almacenamiento y manipulación eficiente de datos en nuestro programa.

- **/interfaces**: El lugar de encuentro para interfaces. Incluye la interfaz `PostfixEvaluator`, que establece el contrato para evaluar expresiones postfix.

- **/consoleui**: Contiene la clase `ConsoleUI`, que presenta las expresiones al usuario y realiza las evaluaciones. Además, el método `Show` ofrece una experiencia visual impresionante.

- **datos.txt**: El almacén de expresiones postfix misteriosas. Este archivo contiene múltiples líneas, cada una con una expresión lista para ser calculada.

### ⚙️ JDK

Este proyecto se ha desarrollado utilizando el JDK 17.0.7. Asegúrate de tener esta versión instalada para una experiencia sin problemas.

## Cómo Ejecutar el Programa

1. **Descarga del Repositorio**: Clona o descarga este repositorio en tu máquina local.

    ```bash
    git clone https://github.com/tu-usuario/calculadora-postfix.git
    ```

2. **Configuración de JDK**: Verifica que tienes instalado el JDK 17.0.7.

3. **Ejecución del Programa**: Abre tu terminal y navega hasta la carpeta raíz del proyecto. Ejecuta el siguiente comando:

    ```bash
    javac src/consoleui/*.java src/model/*.java src/interfaces/*.java
    java Main
    ```

4. **¡Listo para la Magia!**: Disfruta de la calculadora postfix en acción. Observa cómo las expresiones en "datos.txt" cobran vida y revelan resultados sorprendentes.

### 👨‍🦱 INTEGRANTES

Osman Emanuel de Leon Garcia (23428)
Diego Fernando Patzán Marroquín (23525)