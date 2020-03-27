CREATE TABLE swg_book(
  id INTEGER,
  author VARCHAR(255) NOT NULL,
  title VARCHAR(255) NOT NULL,

  CONSTRAINT pk_zf_user_role PRIMARY KEY (id)
);

COMMENT ON TABLE swg_book IS 'Книги';
COMMENT ON COLUMN swg_book.id is 'Идентификатор';
COMMENT ON COLUMN swg_book.author is 'Автор';
COMMENT ON COLUMN swg_book.title is 'Название';

CREATE SEQUENCE swg_book_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 2147483648
  START 1
  CACHE 1;


