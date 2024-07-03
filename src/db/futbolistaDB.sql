CREATE TABLE IF NOT EXISTS posicion (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS futbolista (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    caracteristicas TEXT,
    posicion_id BIGINT,
    FOREIGN KEY (posicion_id) REFERENCES posicion(id),
    UNIQUE (nombres, apellidos, fecha_nacimiento)
);

-- Insertar posiciones
INSERT IGNORE INTO posicion (nombre) VALUES 
('Arquero'), 
('Defensa Central'), 
('Defensa Lateral Derecho'), 
('Defensa Lateral Izquierdo'), 
('Defensa Líbero'), 
('Defensa Carrilero Derecho'), 
('Defensa Carrilero Izquierdo'), 
('Mediocampista Defensivo'), 
('Mediocampista Central'), 
('Mediocampista Ofensivo'), 
('Extremo Derecho'), 
('Extremo Izquierdo'), 
('Delantero Centro'), 
('Segundo Delantero');

-- Insertar futbolistas
INSERT IGNORE INTO futbolista (nombres, apellidos, fecha_nacimiento, caracteristicas, posicion_id) VALUES
('Carlos', 'Perez', '1990-01-01', 'Rápido y ágil', 1),
('Juan', 'Lopez', '1992-02-02', 'Defensa central fuerte', 2),
('Marcelo', 'Gomez', '1994-03-03', 'Mediocampista creativo', 9),
('Luis', 'Ramirez', '1991-04-04', 'Delantero con buen remate', 13),
('Erich', 'Schmidt', '1989-05-05', 'Arquero con reflejos', 1),
('Pedro', 'Martinez', '1993-06-06', 'Defensa lateral rápido', 3),
('Pablo', 'Garcia', '1995-07-07', 'Mediocampista defensivo', 8),
('Jose', 'Hernandez', '1996-08-08', 'Delantero rápido', 13),
('Andres', 'Fernandez', '1988-09-09', 'Arquero alto', 1),
('Rafael', 'Morales', '1997-10-10', 'Defensa central', 2),
('Mario', 'Gutierrez', '1991-11-11', 'Mediocampista ofensivo', 10),
('Manuel', 'Diaz', '1990-12-12', 'Delantero con buen cabezazo', 13),
('Jorge', 'Sanchez', '1994-01-13', 'Arquero experimentado', 1),
('Hugo', 'Vargas', '1992-02-14', 'Defensa fuerte', 2);



