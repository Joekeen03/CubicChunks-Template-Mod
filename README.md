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
        * You may need to explicitly create the "out" folder.
        * Project compiler output is under Project Settings>Project
    c. Potentially restart your IDE.
8. Add the CubicChunks dev-all jar to the run/mods directory
    * Can't figure out how to avoid needing this.
    * .jar is currently available at: https://jenkins.daporkchop.net/job/OpenCubicChunks/job/CubicChunks/job/MC_1.12/ under the "Last Successful Artifacts".
        * Filename's format is: "CubicChunks-1.12-"+versionNumber+"-SNAPSHOT-dev-all.jar"
    * Again, you may need to explicitly create the run/mods directory.

Notes:
* For running the project, you need to use the runClient configuration (the one with a window icon) from the run configuration dropdown.
* The mixins in this project need MixinBooter to be loaded in (though other mixin loader/bootstrap mods may also work)
* Javadocs for the included Mixins library don't work; you'll want to go to the Mixins repo ([https://github.com/SpongePowered/Mixin]), and either look at the source for a given class, or the Wiki if you're new to Mixins
    - Wiki is at [https://github.com/SpongePowered/Mixin/wiki], and can also be accessed via the Wiki tab in the top row of tabs (same one that has Code, Issues, and Pull Requests)
* To add a mixin, add the mixin class to mixin/mixinplugin/, then in resources/mixins.modid.json, add the mixin class's name to the "mixins" list if both client and server require it, or to the "client" or "server" lists if only one side needs the mixin.