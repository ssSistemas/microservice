DROP TABLE IF EXISTS task;

CREATE TABLE task (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL
);

INSERT INTO task (name, description) 
VALUES
    ('Nome 1', 'Tarefa 1'),
    ('Nome 2', 'Tarefa 2'),
    ('Nome 3', 'Tarefa 3');
