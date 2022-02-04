# TEAM ZOMBIE MINECRAFT MOD / COMP5541 Winter 2022

## MOD DESCRIPTION & INFORMATION

The idea of this mod is to bring into the world the items and functionalities of the Pokemon world. Items like pokemon balls and functionality like catching and releasing pokemon. 


### MINECRAFT

This mod is developped around Minecraft version 1.18.1

### FORGE

This mod is built using *forge* version 39.0.59
[Installer](https://adfoc.us/serve/sitelinks/?id=271228&url=https://maven.minecraftforge.net/net/minecraftforge/forge/1.18.1-39.0.59/forge-1.18.1-39.0.59-installer.jar) & [MDK](https://adfoc.us/serve/sitelinks/?id=271228&url=https://maven.minecraftforge.net/net/minecraftforge/forge/1.18.1-39.0.59/forge-1.18.1-39.0.59-mdk.zip)


## INSTALLATION

Step 1: Open your command-line and browse to the folder where you extracted the zip file.

Step 2: You're left with a choice.

If you prefer to use Eclipse:
1. Run the following command: `gradlew genEclipseRuns` (`./gradlew genEclipseRuns` if you are on Mac/Linux)
2. Open Eclipse, Import > Existing Gradle Project > Select Folder 
   or run `gradlew eclipse` to generate the project.
 
*Notes: Use can also skip step 1 and simply run the gradle task `genEclipseRuns` once the gradle project has properly been imported into eclipse.

If you prefer to use IntelliJ:
1. Open IDEA, and import project.
2. Select your build.gradle file and have it import.
3. Run the following command: `gradlew genIntellijRuns` (`./gradlew genIntellijRuns` if you are on Mac/Linux)
4. Refresh the Gradle Project in IDEA if required.
