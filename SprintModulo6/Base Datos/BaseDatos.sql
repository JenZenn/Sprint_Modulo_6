CREATE DATABASE prevencion_riesgos;
USE prevencion_riesgos;

-- Tabla "Perfiles"
CREATE TABLE Perfiles (
  id INT PRIMARY KEY AUTO_INCREMENT,
  tipo VARCHAR(25) NOT NULL
);

-- Tabla "Usuarios"
CREATE TABLE Usuarios (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  estado ENUM('0', '1') NOT NULL DEFAULT '0'
);

-- Tabla "Capacitaciones"
CREATE TABLE Capacitaciones (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  detalle TEXT
);

-- Tabla "Visitas"
CREATE TABLE Visitas (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cliente_id INT,
  fecha_visita DATE,
  detalle TEXT,
  FOREIGN KEY (cliente_id) REFERENCES Usuarios(id)
);

-- Tabla "Chequeos"
CREATE TABLE Chequeos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  visita_id INT,
  detalle TEXT,
  estado ENUM('Pendiente', 'Completado'),
  FOREIGN KEY (visita_id) REFERENCES Visitas(id)
);

-- Tabla "Pagos"
CREATE TABLE Pagos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cliente_id INT,
  monto DECIMAL(10,2),
  fecha_pago DATE,
  FOREIGN KEY (cliente_id) REFERENCES Usuarios(id)
);

-- Tabla intermedia "usuario_perfil"
CREATE TABLE usuario_perfil (
  usuario_id INT,
  perfil_id INT,
  FOREIGN KEY (usuario_id) REFERENCES Usuarios(id),
  FOREIGN KEY (perfil_id) REFERENCES Perfiles(id)
);

-- Registros para la tabla "Perfiles"
INSERT INTO Perfiles (tipo) VALUES
  ('Cliente'),
  ('Administrativo'),
  ('Profesional');
  

-- Registros para la tabla "Usuarios"
INSERT INTO Usuarios (nombre, username, password, email) VALUES
  ('Admin1', 'admin1', '{noop}adminpass1', 'admin1@email.com'),
  ('Pedro Rodriguez', 'pedrorodriguez', '{noop}clave789', 'pedro@email.com'),
  ('Laura Smith', 'laurasmith', '{noop}laura123', 'laura@email.com');
  

-- Registros para la tabla "Capacitaciones"
INSERT INTO Capacitaciones (nombre, detalle) VALUES
  ('Capacitación de Seguridad Laboral', 'Capacitación introductoria sobre seguridad laboral.'),
  ('Capacitación de Primeros Auxilios', 'Capacitación en técnicas de primeros auxilios.'),
  ('Curso de Prevención de Incendios', 'Curso avanzado sobre prevención y control de incendios.'),
  ('Capacitación en Ergonomía', 'Capacitación sobre ergonomía en el lugar de trabajo.'),
  ('Curso de Normativas de Seguridad', 'Curso sobre las normativas de seguridad vigentes.'),
  ('Taller de Higiene en el Trabajo', 'Taller práctico sobre higiene y limpieza en el trabajo.');

-- Registros para la tabla "Visitas"
INSERT INTO Visitas (cliente_id, fecha_visita, detalle) VALUES
  (1, '2023-08-15', 'Reunión de seguimiento mensual.'),
  (2, '2023-08-16', 'Inspección de seguridad en sitio.'),
  (3, '2023-08-17', 'Entrega de informe administrativo.');


-- Registros para la tabla "Chequeos"
INSERT INTO Chequeos (visita_id, detalle, estado) VALUES
  (1, 'Verificación de equipos de seguridad', 'Completado'),
  (2, 'Inspección de extintores', 'Pendiente'),
  (3, 'Revisión de cuentas financieras', 'Completado');


-- Registros para la tabla "Pagos"
INSERT INTO Pagos (cliente_id, monto, fecha_pago) VALUES
  (1, 500.00, '2023-08-15'),
  (2, 750.00, '2023-08-16'),
  (3, 1200.00, '2023-08-17');
 

-- Registros para la tabla intermedia "usuario_perfil"
INSERT INTO usuario_perfil (usuario_id, perfil_id) VALUES
  (1, 1),
  (2, 1),
  (3, 2);
 
