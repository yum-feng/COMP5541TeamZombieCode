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

_(ubuntu)_

```bash
sudo snap install intellij-idea-community --classic --channel=2021.3
```

### First run

Open this repository with IntelliJ IDEA. Upon visiting the project, the IDE should discover the project's gradle configurations and spend a few minutes configuring itself for the first time.

Once ready, launch the gradle task `genIntellijRuns`. This task will generate the following run configurations: `runClient`, `runServer` and `runData`. 

_(See IntelliJ IDEA's [documentation](https://www.jetbrains.com/help/idea/work-with-gradle-tasks.html) about gradle integrations)_

Running the configuration `runClient` will start up instance of mod.

## Build and release

### preparation

1. Adjust the versioning in `/build.gradle` file and commit the changes.
1. Tag the commit and push the tag onto remote:

```shell
git tag ${version}
git push origin ${version}
```

### building

1. Run `gradle build` to produce the mod file will be found in `/build/libs/`.

### releasing

1. [Draft a release on GitHub](https://github.com/yum-feng/COMP5541TeamZombieCode/releases/new).
   1. Attach the jar file from `/build/libs/`.
   1. Select the `${version}` as the tag.
   1. Populate the release title with the `${version}`.
   1. (Optional) List important PRs in the release's description.
