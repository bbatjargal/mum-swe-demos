INSERT INTO roles (id, name) VALUES (1, 'ADMIN') ON DUPLICATE KEY UPDATE name = 'ADMIN';
INSERT INTO users (id, username, password) VALUES (1, 'admin', '$2a$10$l9r6qEgOWHAZtzlSH9NP6uSpa06ESE4gAjbRBrGJPUCDB2VyatDVS') 
ON DUPLICATE KEY UPDATE username = 'admin', password='$2a$10$l9r6qEgOWHAZtzlSH9NP6uSpa06ESE4gAjbRBrGJPUCDB2VyatDVS';
INSERT INTO user_role (user_id, role_id) VALUES (1, 1) ON DUPLICATE KEY UPDATE user_id = 1, role_id=1;