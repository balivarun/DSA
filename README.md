# DSA — Folder structure

This repository contains a set of data-structures and algorithm examples (Java). The layout is intentionally simple: each top-level folder groups related algorithms or data structures with one or more Java source files and small example runners.

## Repository layout

- `Arrays/` — Array problems and implementations.
- `Bit_manipulation/` — Bitwise algorithm examples.
- `doubly_linkedlist/`
  - `DoublyLinkedList.java`, `Node.java` — core implementation.
  - `example/` — small runners, e.g. `DoublyExample.java`.
- `Dynamic_Programming/` — DP problems and solutions.
- `graph/` — Graph utilities and BFS/DFS examples (`bfs.java`, `create_graph*.java`, etc.).
- `Graph_Algo/` — Higher-level graph algorithms.
- `Greedy_Algo/` — Greedy algorithm examples.
- `Hash_Table/` — Hash table implementations (e.g. `Hash.java`).
- `Heap/` — Heap and priority-queue examples.
- `Linked_List/` — Singly linked list examples and runners (`insertion.java`, `deletionfront.java`, ...).
- `Queue/` — Queue implementations/examples.
- `Recursion&Backtracking/` — Recursive and backtracking problems.
- `searching_Algo/` — Searching algorithms (binary search, etc.).
- `Sliding_Window/` — Sliding window pattern problems.
- `Sorting_Algo/` — Sorting algorithm implementations (previously `Soring_Algo`).
- `Stack/` — Stack examples.
- `String/` — String algorithm problems.
- `Trees/` — Tree data structures and algorithms.

## Notable files
- `doubly_linkedlist/DoublyLinkedList.java` — doubly linked list implementation.
- `doubly_linkedlist/example/DoublyExample.java` — example runner for the doubly linked list.
- `Linked_List/` — various single-file examples used as runners from the workspace.

## How to build and run
A minimal approach (no build tool): compile all Java files to `bin/` and run a runner class by its package-qualified name.

```bash
# create output directory
mkdir -p bin
# compile all Java sources into bin
javac -d bin $(find . -name "*.java")
# run an example (adjust package path to the runner you want)
java -cp bin doubly_linkedlist.example.DoublyExample
```

If you prefer compiling a single folder or file, point `javac` at the specific `.java` files and include any needed dependencies.

## Java version and upgrading to Java 21
Workspace runs indicate Java 17 is currently used by the editor/terminal. To move to Java 21 (latest LTS):

- Install JDK 21 (package manager, SDKMAN, or download from a trusted vendor).
- Set `JAVA_HOME` to the JDK 21 install path and put `$JAVA_HOME/bin` earlier in your `PATH`.
- Restart your editor/IDE (or update its JDK setting) and verify with:

```bash
java -version
echo $JAVA_HOME
```

If you'd like, I can add a simple Maven or Gradle build to pin the Java toolchain and make upgrading smoother.

## Notes & tips
- There is no centralized build file (Maven/Gradle) detected in the workspace root; adding one gives reproducible builds and easy toolchain configuration.
- Folder `Sorting_Algo` was previously named `Soring_Algo` — consider renaming to keep names consistent.
- Keep each example small and package-qualified so `java -cp bin <package.Class>` works consistently.

---
Generated on: 2025-10-21
