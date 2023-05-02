INSERT INTO users(id, first_name, last_name, email, image, password, role)
VALUES (1, 'Walter', 'White', 'walter@gmail.com',
        'walter.com', 'walter01', 'ADMIN'),
       (2, 'Jessie', 'Pinkman', 'jessie@gmail.com',
        'jessie.com', 'jessie02', 'USER');

INSERT INTO workspaces(id, name, is_favorite, lead_id)
VALUES (1, 'SpaceX', true, 1),
       (2, 'Starlink', false, 2);
