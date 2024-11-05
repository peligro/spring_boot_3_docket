<hr />
<h1>Spring boot 3 con Docker</h1>

<p>
Ejecutando archivo docker:
<br/>
<code>docker compose up -d</code>
</p>
<hr />
<p>
Entrando a la terminal del proyecto:
<br/>
<code>docker exec -it 3c63aced339c <id_contenedor></code>
</p>

<hr />
<p>
Inicialmente se ejcutará en el puerto 8080, pero se pueda modificar en el archivo properties</p>
<hr />
<p>
EL archivo propierties viene ignorado por temas de seguridad</p>
<hr />
<p>
Detener contenedor:
<br/>
<code>docker-container down</code>
</p>