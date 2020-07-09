insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',0);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 2',80);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 3',150);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma dorada 1',300);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma dorada 2',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma dorada 3',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',500);
insert into rangos (codigo ,descripcion, puntuacion_minima ) values ('PP1','Pluma plateada 1',500);


insert into scores (medalla_bronce ,medalla_plata ,medalla_oro ,puntuacion ) values (0,0,0,0);
insert into scores (medalla_bronce ,medalla_plata ,medalla_oro ,puntuacion ) values (0,0,0,0);
insert into scores (medalla_bronce ,medalla_plata ,medalla_oro ,puntuacion ) values (0,0,0,0);
insert into scores (medalla_bronce ,medalla_plata ,medalla_oro ,puntuacion ) values (5,2,1,0);
insert into scores (medalla_bronce ,medalla_plata ,medalla_oro ,puntuacion ) values (0,0,0,0);

insert into usuarios (id_usuario, apellido , email, nombre, id_score, id_rango ) values ('prueba','Lopez', 'asd@asd.com','Juan',1,1);
insert into usuarios (id_usuario, apellido , email, nombre, id_score, id_rango ) values ('prueba2','nuñez', 'asd@asd.com','Ramon',2,2); 
insert into usuarios (id_usuario, apellido , email, nombre, id_score, id_rango ) values ('prueba3','Perez', 'asd@asd.com','Sebastian',3,3);
insert into usuarios (id_usuario, apellido , email, nombre, id_score, id_rango ) values ('H60CfoiLy6hBk1H8BfcuCtADTHr2','segato', 'lili@lili.com','Liliana',4,3);

insert into usuarios (id_usuario, apellido , email, nombre, id_score, id_rango ) values ('LkroBuuIOWaePXne8Z49rN4j7fQ2','Mayer', 'javimayer14@gmail.com','Javier',5,1);


insert into historias (activo ,genero ,id_usuario ,relato ,titulo, imagen, mg, capitulos ) values (1,'Fantasia','prueba','Al caer la tarde, dos desconocidos se encuentran en los oscuros corredores de una galeria de cuadros. Con un ligero escalofrio uno le dijo al otro','El hombre y el cuadro','https://firebasestorage.googleapis.com/v0/b/welit-adfb8.appspot.com/o/Imagenes%2FHistorias%2Fcuadro.jpg?alt=media&token=4339cb22-e579-4235-9b8d-10256e5e44b3',42,5);
insert into historias (activo ,genero ,id_usuario ,relato ,titulo, imagen, mg, capitulos ) values (1,'Fantasia','prueba','Era multimillonaria y del mas alto nivel','Prueba', 'https://firebasestorage.googleapis.com/v0/b/welit-adfb8.appspot.com/o/Imagenes%2FHistorias%2Fcuadro.jpg?alt=media&token=4339cb22-e579-4235-9b8d-10256e5e44b3', 30, 12);

insert into historias (activo ,genero ,id_usuario ,relato ,titulo, imagen, mg, capitulos ) values (0,'Fantasia','prueba','Era multimillonaria y del mas alto nivel','El rey Leon', 'https://firebasestorage.googleapis.com/v0/b/welit-adfb8.appspot.com/o/Imagenes%2FHistorias%2Fcuadro.jpg?alt=media&token=4339cb22-e579-4235-9b8d-10256e5e44b3',40,20);
insert into historias (activo ,genero ,id_usuario ,relato ,titulo, imagen, mg, capitulos ) values (0,'Fantasia','prueba','Era multimillonaria y del mas alto nivel','Caperusita roja', 'https://firebasestorage.googleapis.com/v0/b/welit-adfb8.appspot.com/o/Imagenes%2FHistorias%2Fcuadro.jpg?alt=media&token=4339cb22-e579-4235-9b8d-10256e5e44b3',20,15);



insert into comentarios (comentario ,ganador ,mg ,id_historia ,id_usuario, capitulo, participando ) values ('Al caer la tarde, dos desconocidos se encuentran en los oscuros corredores de una galeria de cuadros. Con un ligero escalofrio uno le dijo al otro',1,20,1,'prueba',1,0);     
insert into comentarios (comentario ,ganador ,mg ,id_historia ,id_usuario, capitulo, participando ) values ('Eres el elegido. El individuo no entendia porque se lo habia dicho, y comenzo a hacerle muchas preguntas , a las que el otro no responddio, solo lo miro fijamente a los ojos y moviendo los brazos agitadamente, como quien imita el vuelo de un pajaro se fue',1,20,1,'prueba',2,0);     
insert into comentarios (comentario ,ganador ,mg ,id_historia ,id_usuario, capitulo, participando ) values ('Cruzo entonces la ciuadad en busa de lo que el ni siquiera sabia. Cuando entro al  al hall principal todavia en penumbras sintio como sus pies chapoteaban a cada paso , le parecio extraño y al prender los reflectores descubrio que no se trataba de aagua sino de sangre proveniente de perro muertos',0,45,1,'prueba2',3,1); 
insert into comentarios (comentario ,ganador ,mg ,id_historia ,id_usuario, capitulo, participando ) values ('AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA',0,15,1,'prueba2',3,1);
insert into comentarios (comentario ,ganador ,mg ,id_historia ,id_usuario, capitulo, participando ) values ('BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB',0,15,1,'prueba2',3,1);    
insert into comentarios (comentario ,ganador ,mg ,id_historia ,id_usuario, capitulo, participando ) values ('CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC',0,15,1,'prueba2',3,1);    
insert into comentarios (comentario ,ganador ,mg ,id_historia ,id_usuario, capitulo, participando ) values ('DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD',0,50,1,'LkroBuuIOWaePXne8Z49rN4j7fQ2',3,1);    
   
   
insert into comentarios (comentario ,ganador ,mg ,id_historia ,id_usuario, capitulo, participando ) values ('Desconsertado, Rafael, que asi se llamaba nuestro protagonista, penso en una broma de mal gusto, pero no podia olvidarse de esa mirada que lo dejo perplejo y lo siguio durante dias, algo le decia que debia volver a la muestra de arte. Quiza allli encontraria una respuesta.',0,10,1,'prueba3',3,1);   

