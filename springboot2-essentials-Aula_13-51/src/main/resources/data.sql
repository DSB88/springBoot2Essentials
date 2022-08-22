INSERT INTO anime (name) VALUES
  ('Naruto'),
  ('Dragon Ball'),
  ('Cavaleiros do Zodiaco'),
  ('Castlevania'),
  ('One Punch-Man'),
  ('Apenas um Show'),
  ('He-Man'),
  ('Coragem o cao covarde'),
  ('Familia Dinossauro'),
  ('Bob Esponja');

INSERT INTO dev_dojo_user (authorities, name, password, username) VALUES

('ROLE_ADMIN, ROLE_USER','Diego Brandao', '{bcrypt}$2a$10$6Qh3Y2Gp7c3JQxAJ4u7gvO5ghL4I620YIMjC82DJSg7.5kl49Aj4q','diego'),
('ROLE_USER','William Suane', '{bcrypt}$2a$10$6Qh3Y2Gp7c3JQxAJ4u7gvO5ghL4I620YIMjC82DJSg7.5kl49Aj4q','william'),
('ROLE_VISITOR','Visitante', '{bcrypt}$2a$10$6Qh3Y2Gp7c3JQxAJ4u7gvO5ghL4I620YIMjC82DJSg7.5kl49Aj4q','pessoa');