To set this mod up, you should just need to download/clone the repo, then import the repo's folder into IntelliJ. and config a couple things in Intellij.
E.g.:
1. Download the .zip from GitHub
2. Extract the .zip, and rename the resultant folder whatever you want
3. Open up IntelliJ and tell it to open the folder as a project
4. Wait for Intellij to finish setting up.
5. Run the genIntellijRuns task (gradle tab, under Tasks/forgegradleruns)
6. Set Intellij to use IntellijIDEA for runs
    a. Gradle tab, Build Tool Settings (wrench icon)
    b. Gradle Settings
    c. Build and run using "Intellij IDEA"
    d. Run tests using "Intellij IDEA"
7. Set the project's output directory to /out/
    a. File>Project Structure
    b. Project compiler output: Path to your mod's folder, plus "\out"
        * Should be the full, qualified path, as it would appear in Windows Explorer (or your OS's file explorer)
        * E.g. "D:\Documents\TestMod\out"
        * Project compiler output is under Project Settings>Project
8. Potentially restart your IDE.