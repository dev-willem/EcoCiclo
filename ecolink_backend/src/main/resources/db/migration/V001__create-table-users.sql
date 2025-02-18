CREATE SEQUENCE users_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE users (
    id BIGINT PRIMARY KEY DEFAULT nextval('users_id_seq'),
    username VARCHAR(50) NOT NULL,
    cpf_cnpj VARCHAR(20) NOT NULL,
    location TEXT NOT NULL,
    password_hash VARCHAR(60) NOT NULL,
    email VARCHAR(255) NOT NULL,
    img_profile TEXT,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT now() NOT NULL,
    CONSTRAINT users_email_unique UNIQUE (email),
    CONSTRAINT users_cpf_cnpj_unique UNIQUE (cpf_cnpj)
);