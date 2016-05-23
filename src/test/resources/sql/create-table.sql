CREATE TABLE IF NOT EXISTS one.users (
  id INTEGER PRIMARY KEY,
  name VARCHAR(30),
  email  VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS one.home (
  id INTEGER PRIMARY KEY,
  home_name VARCHAR(30),
  home_address VARCHAR(50)
);