<h1 align="center">
📊 Tratamiento de Datos y Análisis de Evasión de Clientes — Telecom X (ETL)
</h1>

<p align="center">
Proyecto de <b>Extracción, Transformación y Análisis de Datos (ETL)</b> desarrollado con Python para el estudio de evasión de clientes (<i>Churn</i>) en Telecom X.
</p>

<hr>

<h2>📌 Descripción del Proyecto</h2>

<p>
Este proyecto implementa un proceso completo de <b>ETL (Extract, Transform, Load)</b> utilizando Python y herramientas de análisis de datos.
</p>

<p>
El sistema permite realizar la lectura de un archivo <code>JSON</code> desde una fuente externa mediante URL, aplicar un tratamiento estandarizado de inconsistencias, corregir valores vacíos y validar tipos de datos para garantizar la calidad de la información.
</p>

<p>
Posteriormente se desarrolla un <b>Análisis Exploratorio de Datos (EDA)</b> enfocado en la evasión de clientes de la empresa Telecom X, utilizando gráficas y material visual que permiten identificar patrones, tendencias y relaciones importantes entre variables.
</p>

<hr>

<h2>🎯 Objetivos</h2>

<ul>
  <li>Extraer datos desde una fuente externa en formato JSON.</li>
  <li>Transformar y limpiar información inconsistente.</li>
  <li>Normalizar estructuras y tipos de datos.</li>
  <li>Preparar un dataset listo para análisis.</li>
  <li>Analizar factores relacionados con la evasión de clientes.</li>
  <li>Generar visualizaciones para interpretar patrones de comportamiento.</li>
</ul>

<hr>

<h2>📂 Estructura del Proyecto</h2>

<pre>
TelecomX/
│
├── README.md
├── TelecomX_ETL.ipynb
│
├── data/
│   ├── raw/
|        └── TelecomX_Data.json
│   └── processed/
|        └── TelecomX_DataTrate.json
│
└── reports/
    ├── figures/
    |    ├── Categorical_Variables
    |    └── Numerical_Variables
    └── analysis/
        └── TelecomX_Analysis.ipynb
</pre>

<hr>

<h2>📁 Archivos Principales</h2>

<table>
  <thead>
    <tr>
      <th>Archivo</th>
      <th>Descripción</th>
    </tr>
  </thead>

  <tbody>
    <tr>
      <td><code>TelecomX_Data.json</code></td>
      <td>Dataset original obtenido desde una fuente externa.</td>
    </tr>
    <tr>
      <td><code>TelecomX_DataTreat.json</code></td>
      <td>Dataset tratado y normalizado después del proceso ETL.</td>
    </tr>
    <tr>
      <td><code>TelecomX_ETL.ipynb</code></td>
      <td>Notebook principal con limpieza, transformación, validación y análisis visual.</td>
    </tr>
    <tr>
      <td><code>README.md</code></td>
      <td>Documentación general del proyecto.</td>
    </tr>
  </tbody>
</table>

<hr>

<h2>⚙️ Tecnologías Utilizadas</h2>

<p align="left">

<img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white">
<img src="https://img.shields.io/badge/Pandas-150458?style=for-the-badge&logo=pandas&logoColor=white">
<img src="https://img.shields.io/badge/NumPy-013243?style=for-the-badge&logo=numpy&logoColor=white">
<img src="https://img.shields.io/badge/Matplotlib-11557C?style=for-the-badge">
<img src="https://img.shields.io/badge/Seaborn-4C72B0?style=for-the-badge">
<img src="https://img.shields.io/badge/Jupyter-F37626?style=for-the-badge&logo=jupyter&logoColor=white">

</p>

<hr>

<h2>🔄 Proceso ETL</h2>

<h3>1️⃣ Extracción</h3>

<ul>
  <li>Lectura de archivo JSON desde URL.</li>
  <li>Validación de estructura de datos.</li>
  <li>Conversión de JSON a DataFrame.</li>
</ul>

<h3>2️⃣ Transformación</h3>

<ul>
  <li>Tratamiento de valores nulos.</li>
  <li>Corrección de inconsistencias.</li>
  <li>Conversión de tipos de datos.</li>
  <li>Estandarización de variables.</li>
  <li>Normalización de formatos.</li>
  <li>Validación de calidad de datos.</li>
</ul>

<h3>3️⃣ Análisis Exploratorio (EDA)</h3>

<ul>
  <li>Análisis de evasión de clientes.</li>
  <li>Distribución de variables.</li>
  <li>Relación entre contratos y churn.</li>
  <li>Análisis de métodos de pago.</li>
  <li>Estudio de permanencia de clientes.</li>
  <li>Correlaciones generales.</li>
</ul>

<hr>

<h2>📊 Visualizaciones</h2>

<p>
El proyecto incluye diferentes representaciones gráficas para facilitar el análisis de los datos:
</p>

<ul>
  <li>📈 Histogramas</li>
  <li>📊 Gráficas de barras</li>
  <li>📉 Diagramas de distribución</li>
  <li>📌 Comparativas categóricas</li>
  <li>📎 Análisis porcentuales</li>
  <li>🔍 Correlaciones entre variables</li>
</ul>

<hr>

<h2>🚀 Ejecución del Proyecto</h2>

<h3>Clonar repositorio</h3>

<pre><code>
git clone https://github.com/BjorkMagno/Portafolio.git
</code></pre>

<h3>Ingresar al proyecto</h3>

<pre><code>
cd Portafolio/data-science/desafios/TelecomX
</code></pre>

<h3>Instalar dependencias</h3>

<pre><code>
pip install pandas numpy matplotlib seaborn jupyter
</code></pre>

<h3>Ejecutar Jupyter Notebook</h3>

<pre><code>
jupyter notebook
</code></pre>

<p>
Abrir el archivo:
</p>

<pre><code>
TelecomX_ETL.ipynb
</code></pre>

<hr>

<h2>📚 Dataset</h2>

<p>
El conjunto de datos contiene información relacionada con:
</p>

<ul>
  <li>Información demográfica</li>
  <li>Servicios contratados</li>
  <li>Facturación</li>
  <li>Métodos de pago</li>
  <li>Tipo de contrato</li>
  <li>Antigüedad del cliente</li>
  <li>Evasión de clientes (Churn)</li>
</ul>

<hr>

<h2>🧠 Conclusión</h2>

<p>
Este proyecto transforma datos crudos en información estructurada y analizable mediante técnicas ETL, permitiendo comprender factores relevantes asociados a la evasión de clientes.
</p>

<p>
Además de mejorar la calidad de los datos, el análisis visual facilita la identificación de patrones útiles para futuras aplicaciones de análisis predictivo y toma de decisiones estratégicas.
</p>

<hr>

<h2>👤 Autor</h2>

<p>
<b>Bjork Magno</b><br>
Proyecto de Ciencia de Datos — Telecom X ETL
</p>
