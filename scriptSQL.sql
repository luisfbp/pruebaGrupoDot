CREATE TABLE peliculas (
  codigo INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  descripcion VARCHAR(500),
  PRIMARY KEY(codigo)
);

CREATE TABLE img_peliculas (
  codigo INT NOT NULL,
  url_img VARCHAR (300) NOT NULL,
  FOREIGN KEY (codigo) REFERENCES peliculas(codigo)
);

INSERT INTO peliculas (nombre, descripcion)
VALUES ('pelicula1', 'Esta es la primera pelicula');

INSERT INTO img_peliculas (codigo, url_img)
VALUES (1, '/img/pelicula1');
