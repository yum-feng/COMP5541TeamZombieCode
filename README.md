# TEAM ZOMBIE MINECRAFT MOD / COMP5541 Winter 2022

## Description

The idea of this mod is to implement some items and functionalities of the Pokémon game. These include items such as Poké Balls, and functionalities such as catching and releasing Pokémons.

## Background

This project is bootstrapped from Forge's MDK 1.18.1-39.0.59, which can be found [here](https://adfoc.us/serve/sitelinks/?id=271228&url=https://maven.minecraftforge.net/net/minecraftforge/forge/1.18.1-39.0.59/forge-1.18.1-39.0.59-mdk.zip).

End users will require the [installer](https://adfoc.us/serve/sitelinks/?id=271228&url=https://maven.minecraftforge.net/net/minecraftforge/forge/1.18.1-39.0.59/forge-1.18.1-39.0.59-installer.jar) to play our mod.

## Development

### Requirements

#### Recommended IDE (IntelliJ IDEA)

_(windows)_

The following powershell command in will install the intelliJ IDEA silently: 

```powershell
$ideaIC="ideaIC-2021.3.2.exe"; (New-Object System.Net.WebClient).DownloadFile("https://download.jetbrains.com/idea/${ideaIC}", "${PWD}/${ideaIC}"); Start-Process "${PWD}/${ideaIC}" -ArgumentList "/S"
```

It is also possible to download the [installer](https://download.jetbrains.com/idea/ideaIC-2021.3.2.exe) and install manually.

_(macos)_

Download the [installer](https://download.jetbrains.com/idea/ideaIC-2021.3.2.dmg) and install manually.

### First run

Open this repository with IntelliJ IDEA, and launch the gradle task `genIntellijRuns`. _(See IntelliJ IDEA's [documentation](https://www.jetbrains.com/help/idea/work-with-gradle-tasks.html) about gradle integrations)_

This task will generate the following run configurations: `runClient`, `runServer` and `runData`. 

Running the configuration `runClient` will start up instance of mod.