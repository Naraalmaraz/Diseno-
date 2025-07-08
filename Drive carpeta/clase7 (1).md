---
marp: true
theme: default
paginate: true
_class: lead
---

# Clase 7  
## Mini-Proyecto: Sistema de Registro de Vehículos  
### Proyecto, Diseño e Implementación de Sistemas Computacionales  
Profesor: Franco Niz  
7.º Año – Escuela Técnica N.º 1 “Ingeniero Rafael Cantón”

---

## Objetivos de la clase

- Aplicar conceptos de POO: **encapsulamiento**, **constructores**, **herencia**, **polimorfismo**
- Desarrollar un proyecto en grupo con clases bien estructuradas
- Diseñar jerarquías y reutilizar código con `abstract`, `extends`, `super`
- Practicar la planificación y codificación en equipo

---

## Proyecto: Registro de Vehículos

Desarrollar en Java un sistema que modele el registro de vehículos de una ciudad.

---

## Requisitos

### Clase abstracta `Vehiculo`
- Atributos: `patente`, `año`, `dueño` (privados)
- Métodos:
  - `mostrarDatos()` → muestra los atributos
  - `calcularImpuesto()` → abstracto

### Subclases
- `Auto` → + `cantidadPuertas`
- `Moto` → + `cilindrada`
- `Camion` → + `cargaMaxima`

Cada una debe:
- Sobrescribir `calcularImpuesto()`:
  - Auto: $5000 + $500 por puerta
  - Moto: $3000 (<250cc) / $6000 (≥250cc)
  - Camión: $8000 + $100 x tonelada

---

## Código en `Main.java`

1. Crear un arreglo de `Vehiculo[]` con objetos `Auto`, `Moto`, `Camion`
2. Recorrer el arreglo con `for`:
   - Llamar a `mostrarDatos()`
   - Llamar a `calcularImpuesto()`

---

## Organización del trabajo

| Tiempo | Actividad |
|--------|-----------|
| 10 min | Presentación del proyecto |
| 10 min | Diseño de clases y UML |
| 50 min | Codificación en grupo |
| 15 min | Pruebas y corrección |
| 5 min  | Cierre grupal |

---

## Cierre y tarea

- Crear clase `RegistroMunicipal`
  - Contiene lista de vehículos
  - Método para buscar vehículos por año o dueño

- Subir proyecto a GitHub
- Adjuntar UML del diseño usado

---

## ¿Preguntas?
