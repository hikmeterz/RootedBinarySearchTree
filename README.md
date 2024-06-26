﻿# RootedBinarySearchTree
This repository contains a Java implementation of a Binary Search Tree (BST) with basic operations such as insertion and traversals. It also includes a function to find the lowest common ancestor in the tree, showcasing fundamental tree manipulations and search techniques.

# Components
BinarySearchTree.java: Implements the binary search tree. This class includes methods to insert keys into the tree, a method to print the tree in preorder, and a function to find the lowest common ancestor based on a specific level.

Node.java: Represents a node in the binary search tree. Each node stores an integer key and has references to its left, right, and parent nodes.

Main.java: Contains the main method which serves as the entry point for the application. It handles user input for the number of elements to add and the level for finding the lowest common ancestor, demonstrating the tree operations.

# Features
Tree Insertion: Dynamically adds elements to ensure the BST properties (left < parent < right) are maintained.
Preorder Traversal: Outputs the tree elements in preorder format (node, left, right).
Lowest Common Ancestor: Finds the lowest common ancestor at a given tree level, illustrating an advanced tree operation.
