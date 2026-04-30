# 🎁 Amigo Secreto — Sorteo en JavaScript

Aplicación web interactiva para realizar un sorteo de “amigo secreto”, desarrollada con HTML, CSS y JavaScript.

## 💡 Descripción

El proyecto permite ingresar nombres en una lista y realizar un sorteo aleatorio para seleccionar un participante.

Está enfocado en la manipulación del DOM, validación de datos y lógica básica en JavaScript, junto con una interfaz sencilla y estilizada.

## ⚙️ Funcionalidades
* Agregar nombres a una lista dinámica.
* Validación de entradas. (vacíos y duplicados)
* Visualización en tiempo real de participantes.
* Sorteo aleatorio de un amigo.
* Reinicio del estado de la aplicación.
  
## 🧩 Estructura
* HTML
  * Estructura de la interfaz.
  * Inputs, listas y botones.
* CSS
  * Estilos visuales.
  * Diseño responsive básico.
  * Uso de variables para colores.
* JavaScript
  * Manejo de eventos.
  * Manipulación del DOM.
  * Lógica del sorteo y validaciones.
    
## 🛠️ Tecnologías
* HTML5
* CSS3
* JavaScript
    
  <h2>🧩 Descripción del código JS.</h2>
  
  1. Se creó una función ***impresionListaAmigos()*** encargada de la impresión de la lista de amigos ingresados correctamente.
  ```javascript
    function impresionListaAmigos(){
        let listaAmigos = document.getElementById('listaAmigos');
            listaAmigos.innerHTML = "";

        for(let i = 0; i < amigos.length; i++){
            let item = document.createElement('li');
                item.textContent = amigos[i];
                listaAmigos.appendChild(item);
        }
    }
  ```
  2. Se creó una función ***agregarAmigos()*** para agregar amigos de forma dinamica y sin limíte máximo. La función valida si la entrada es no vacia o repite algun nombre; e imprime la lista de amigos ingresados.
```javascript
    function agregarAmigo(){
        let inputAmigo = document.querySelector('#amigo');
        let nombreAmigo = inputAmigo.value;

        if (nombreAmigo == false) {
            alert('Por favor, inserte un nombre.');
            return;
        }else{
            for(let i=0; i < amigos.length; i++){
                  if(amigos[i]==nombreAmigo){
                    alert('Ya se ingreso ese nombre.');
                    inputAmigo.value="";
                    inputAmigo.focus();
                    return;
                  }
            }      
        }
        amigos.push(nombreAmigo);
        inputAmigo.value="";
        inputAmigo.focus();
        impresionListaAmigos();
    }
```
  4. Se creó una función ***sortearAmigo()*** para sortear de manera aleatoria un amigo de la agregado por el usuario.
```javascript
    function sortearAmigo(){
        if(amigos.length === 0){
          alert('No hay ningun amigo para sortear.');
          return;
        }

        let amigoSorteado = amigos[Math.floor(Math.random() * amigos.length)];
        resultado.innerHTML = `El amigo secreto es: ${amigoSorteado}`;
        limpiarLista.innerHTML = '';
      }
```
  5. Se creó una función ***condicionesIniciales()*** para volver a como iniciamos.
```javascript
     function condicionesIniciales(){
        amigos =[];
        resultado.innerHTML = '';
        limpiarLista.innerHTML = '';
        return;
      }
 ```
## 🎯 Enfoque
* Interactividad en el navegador.
* Manipulación dinámica de elementos.
* Validación de datos del usuario.
* Lógica de selección aleatoria.

## 📌 Nota

Proyecto orientado a fundamentos de desarrollo frontend y lógica en JavaScript, con énfasis en interacción usuario-aplicación.
