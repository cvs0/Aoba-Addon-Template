# Aoba Client Addon Template

## Features
- Add custom modules
- Add custom commands

## Addon Metadata
- Name
- Author
- Mod ID

## Addon Functions
- `onInitialize` : Runs on addon initialization
- `modules` : Returns the list of modules.
- `commands` : Returns the list of commands.
- `getName` : Returns the addon name as a string.
- `getId` : Returns the Mod ID as a string.
- `getAuthor` : Returns the name of the addon author as a string.

## Files
- `ExampleAddon` : The main class which implements our `IAddon` superclass.

## How it works
- We use the `aoba` entrypoint as our mods main entrypoint.
- Aoba Client scans for other loaded mods using this entrypoint.
- Since they implement the `IAddon` interface which is a part of Aoba Client we can access its methods.
- Aoba Client runs the onInitialize method for each addon.
- Aoba Client retrieves the list of modules and commands for each addon and adds them all to Aoba.

## Roadmap

* More Metadata
* onShutdown method
* HUD elements

## Credits

### coltonk9043 : Developer of Aoba Client.
### cvs0 : Contributor of Aoba Client, and developer of the addon system.