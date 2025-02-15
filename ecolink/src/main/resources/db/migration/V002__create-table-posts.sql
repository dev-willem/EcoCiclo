CREATE SEQUENCE post_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE post (
    id BIGINT PRIMARY KEY DEFAULT nextval('post_id_seq'),
    text TEXT,
    video TEXT,
    image TEXT,
    user_id BIGINT NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT now() NOT NULL,
    CONSTRAINT fk_post_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);