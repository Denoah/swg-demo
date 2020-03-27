INSERT INTO swg_book(id, author, title) VALUES (1, 'Буковски, Чарльз', 'Записки старого козла');
INSERT INTO swg_book(id, author, title) VALUES (2, 'Буковски, Чарльз', 'Музыка горячей воды');

SELECT setval('swg_book_seq', 2);
