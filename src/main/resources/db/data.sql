INSERT INTO users(id, first_name, last_name, email, image, password, role)
VALUES (1, 'Walter', 'White', 'walter@gmail.com',
        'walter.com', 'walter01', 'ADMIN'),
       (2, 'Jessie', 'Pinkman', 'jessie@gmail.com',
        'jessie.com', 'jessie02', 'USER');

INSERT INTO workspaces(id, name, is_favorite, lead_id)
VALUES (1, 'SpaceX', true, 1),
       (2, 'Starlink', false, 2);

INSERT INTO boards(id, title, background, is_favorite, workspace_id)
VALUES (1, 'Windows', 'Green village', true, 1),
       (2, 'MacOS', 'Blue sky', false, 2);

INSERT INTO columns(id, title, is_archive, board_id, creator_id)
VALUES (1, 'First column', false, 1, 1),
       (2, 'Second column', true, 2, 2);

INSERT INTO cards(id, title, description, created_at, is_archived, movedUser, column_id, creator_id)
VALUES (1, 'Point', 'Some task that you should to do', '2022-10-31 11:35:29.563870', false, 1, 2, 2),
       (2, 'Participants', 'Add some participants', '2023-05-05 21:10:40.469005', true, 2, 1, 1);