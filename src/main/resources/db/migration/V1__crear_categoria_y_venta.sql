CREATE TABLE categoria (
    id      INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre  VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE venta (
    id            INTEGER PRIMARY KEY AUTOINCREMENT,
    fecha         DATE NOT NULL,
    descripcion   VARCHAR(255) NOT NULL,
    cantidad      INTEGER NOT NULL CHECK (cantidad >= 1),
    importe       DECIMAL(10,2) NOT NULL CHECK (importe > 0),
    categoria_id  INTEGER NOT NULL,
    notas         TEXT,
    creado_en     TIMESTAMP NOT NULL,
    FOREIGN KEY (categoria_id) REFERENCES categoria(id)
);

CREATE INDEX idx_venta_fecha ON venta(fecha);