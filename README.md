# 🧠 Mind Maze (Java OOP Game)

## 📌 Overview
**Mind Maze** is a simple text-based puzzle game made in Java.  
The player explores different rooms in a maze — some give rewards, others cause traps, and one leads to the exit.  
It shows how **Object-Oriented Programming (OOP)** concepts like inheritance, polymorphism, and encapsulation work together in a fun way.

---

## 🎮 Gameplay
- You start with 100 energy.  
- Each room has a random event:
  - 🧩 **Quiz Room:** Answer a question to gain or lose energy.  
  - 💀 **Trap Room:** Lose some energy.  
  - 💰 **Treasure Room:** Gain energy or score.  
  - 🏁 **Exit Room:** Win the game!  
- The game ends when your energy reaches 0 or you find the exit.

---

## ⚙️ OOP Concepts Used
| Concept | Description |
|----------|-------------|
| **Encapsulation** | Player stats are private with getter/setter methods. |
| **Inheritance** | All rooms extend from one base `Room` class. |
| **Polymorphism** | Each room has its own version of `enterRoom()`. |
| **Abstraction** | `Room` is an abstract class that defines structure for all rooms. |
| **Exception Handling** | Handles wrong or invalid user inputs. |

---

## 🧩 Main Classes
- `Room` – Abstract class for all rooms.  
- `QuizRoom`, `TrapRoom`, `TreasureRoom`, `ExitRoom` – Each has different effects.  
- `Player` – Stores name, energy, and score.  
- `Question` – Used in quiz rooms for questions and answers.  
- `MazeGame` – Main class that runs the game.
