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

INSERT INTO cards(id, title, description, created_at, is_archived, moved_user_id, column_id, creator_id)
VALUES (1, 'Point', 'Some task that you should to do', '2022-10-31 11:35:29.563870',
        false, 1, 2, 2),
       (2, 'Participants', 'Add some participants', '2023-05-05 21:10:40.469005',
        true, 2, 1, 1);

INSERT INTO checklists(id, title, count, card_id)
VALUES (1, 'Checklist', 1, 1);

INSERT INTO subtasks(id, description, is_done, checklist_id)
VALUES (1, 'Solve the conflict', false, 1),
       (2, 'Create the method', true, 1);

INSERT INTO estimations(id, startDate, dueDate, startTime, dueTime, notification_time, reminder_type, card_id, user_id)
values (1, '2022-02-01', '2022-12-12', '2022-12-17 17:05:00.000000','2022-12-19 17:11:00.000000',
        '2022-12-19 17:06:00.000000', 'FIFTEEN_MINUTE',1, 1);
