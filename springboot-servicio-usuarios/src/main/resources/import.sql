INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$a41hRwZWb4MueleusWJgAerda5zrFVYfwmb1y0YF7DG4CGAwd5.jG',1,'Andres','Gasca','andresg1006@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$hnlCfWaeDvEcFmY4t5FaFOG7ho.DSZdlODVNhNwSF6VvqqWrX5/wu',1,'Jhon','Doe','jhon.doe@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, roles_id) VALUES (1,1);
INSERT INTO `usuarios_roles` (usuario_id, roles_id) VALUES (2,2);
INSERT INTO `usuarios_roles` (usuario_id, roles_id) VALUES (2,1);