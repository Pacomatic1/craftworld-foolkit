# Craftworld Toolkit

![Application](https://github.com/ennuo/toolkit/assets/67672427/b24a1bb0-eefc-4c5d-bc38-173e949e3154)

# About

Craftworld Toolkit is an extended version of [farctool2](https://github.com/philosophofee/farctool2)
by [philosophofee](https://github.com/philosophofee/) designed to mod the mainline LittleBigPlanet
series.


A smug basement dweller, [Pacomatic](https://github.com/Pacomatic1), then decided to try forking this and see if he can add quality of life features to auto-import stuff and use bookmarks, because he is extremely lazy but also wants this to be easier for others.

Keyword: Try. I scarcely know Java, do not expect anything because I promise you, you **will** be disappointed. But if you wanna have a go at it, go crazy bud. I believe in you.

# Features
- Read and edit gamedata files and resources from every mainline LittleBigPlanet game
- Texture viewing, exporting, and importing
- Model exporting to either Wavefront OBJ or glTF 2.0
- Convert inventory items, levels, and other common resources to/from JSON
- Save editor, edit levels and items in your big profile
- Pack/Slot editor for modifying story levels and extra content
- Mod file install/export to both game and save data

## Plans, assuming I do them 
First up, I want to understand what this thing is, mainly on account of me being new to Java.

I told you, don't get your hopes up.

But, if I succeed, then I can go to the actual fun:
- Importing more image formats than PNGs
- Batch exports
- Auto-detecting all the farcs that a blurayguid wants to use (probably recursive search current directory and all children 'till I get all the folders I want)
- Instead of using profiles to auto-open savefiles and blurayguids, just have a bookmarks bar instead
- Allow you to customize the name of a tab
- An 'ez mod maker' that lets you make mods super easily. Import some files, give it a title and description, and get yourself a `.mod`. 
Most of the stuff I want is qualty-of-life stuffs.

# Building
Just get [maven](https://maven.apache.org/) and JDK 17, and run the shell scripts I made. So long as you installed maven correctly, this should work. Hopefully.

The build should appear in `./toolkit/target/`.

(Tested on Windows with maven 3.9.11, JDK 17, but it's one simple command so I **hope** that it's the same for other platforms.)