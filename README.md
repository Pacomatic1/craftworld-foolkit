# Preface
I am considering. **CONSIDERING.** Adding some qualityOfLife features to Tookit, so I forked it.

Maybe this will end up being better. Maybe nothing will change.

I s'pose we'll find out ¯\\_(ツ)_/¯


# Craftworld Toolkit

![Application](https://github.com/ennuo/toolkit/assets/67672427/b24a1bb0-eefc-4c5d-bc38-173e949e3154)

# About

Craftworld Toolkit is an extended version of [farctool2](https://github.com/philosophofee/farctool2)
by [philosophofee](https://github.com/philosophofee/) designed to mod the mainline LittleBigPlanet
series.

# Features

- Read and edit gamedata files and resources from every mainline LittleBigPlanet game
- Texture viewing, exporting, and importing
- Model exporting to either Wavefront OBJ or glTF 2.0
- Convert inventory items, levels, and other common resources to/from JSON
- Save editor, edit levels and items in your big profile
- Pack/Slot editor for modifying story levels and extra content
- Mod file install/export to both game and save data

## Planned Features, assuming I do them 
- Importing more image formats than PNGs
- Batch exports
- Auto-detecting all the farcs that a blurayguid wants to use
- Instead of using profiles to auto-open savefiles and blurayguids, just have a bookmarks bar instead
- Allow you to customize the name of a tab


# Building
Just get [maven](https://maven.apache.org/) and JDK 17, and run the shell scripts I made. So long as you installed maven correctly, this should work. Hopefully.

The build should appear in `./toolkit/target/`.

(Tested on Windows with maven 3.9.11, JDK 17, but it's one simple command so I **hope** that it's the same for other platforms.)