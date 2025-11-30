# 🧠 Mind Maze: An OOP-Based Puzzle Adventure Game in Java

<p align="center">
**CS-2101**<br>
Tristan Allen Cabral<br> 
Paul Dharren Alday<br> 
Ericson Chester Lozada<br>
</p>
---

## 📜 Overview
**Mind Maze** is a text-based adventure game where players must escape a mysterious maze filled with quiz rooms, traps, and treasures.  
Each decision affects your energy and score, testing your logic, memory, and luck.  
The project demonstrates core **Object-Oriented Programming (OOP)** principles such as **inheritance**, **polymorphism**, **abstraction**, and **encapsulation**, along with **exception handling** and **Java Collections**.

---

## 🎮 Gameplay
1. You begin with 100 energy points.  
2. Navigate through randomly generated rooms:
   - 🧩 **Quiz Room:** Answer questions correctly to gain or keep energy.  
   - 💀 **Trap Room:** Lose energy when caught in a trap.  
   - 💰 **Treasure Room:** Gain bonus energy or points.  
   - 🏁 **Exit Room:** Escape the maze and win!  
3. The game ends when:
   - You reach the **Exit Room**, or  
   - Your **energy** drops to zero.  

---

## ⚙️ Technical Details

| Feature | Description |
|----------|-------------|
| **Language** | Java |
| **Concepts Used** | Encapsulation, Inheritance, Polymorphism, Abstraction |
| **Additional Topics** | Exception Handling, Randomization, Arrays/ArrayList |
| **Type** | Console-based Game |
| **Input** | User text (via `Scanner`) |
| **Output** | Console messages and interactions |

---

## 🧩 Class Structure

### 🏛️ `Room` *(Abstract Superclass)*
- Represents a generic room in the maze.
- Defines the abstract method `enterRoom(Player player)` that subclasses override.

### 🧠 `QuizRoom`
- Prompts the player with random quiz questions.
- Rewards or penalizes energy based on correct or wrong answers.

### 💀 `TrapRoom`
- Simulates traps that reduce player energy randomly.

### 💰 `TreasureRoom`
- Grants bonus points or energy when found.

### 🏁 `ExitRoom`
- Ends the game when reached.

### 🧍‍♂️ `Player`
- Stores the player’s name, energy, and score.
- Includes methods to modify stats and check if the player is still alive.

### 🎮 `MindMaze`
- Main controller class.
- Handles the game loop, player input, room creation, and transitions.

