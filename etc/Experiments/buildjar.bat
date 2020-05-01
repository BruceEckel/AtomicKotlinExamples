rem @echo Main-Class: oodesign.ExploreMazeKt> manifest.txt
kotlinc -include-runtime ExploreMaze.kt Factory.kt MazeView.kt Players.kt Result.kt RobotMaze.kt Room.kt Stage.kt Urge.kt View.kt ..\AtomicTest\AtomicTest.kt -d ExploreMaze.jar
rem jar ufm ExploreMaze.jar manifest.txt
