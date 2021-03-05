INSERT INTO users (login, password, name, secret, roles)
VALUES ('admin','secret','Admin','admin','{ROLE_ADMIN,ROLE_USER}'),
       ('user','password','User','user','{ROLE_USER}');