// Here is the groovy file for screen elements
info("Hello From 'Slight' Gui Modifications cts script")

mainMenu {
    enabled = true // Set to true to enable this module

    // Uncomment these to remove aspects of the title screen
    // removeMinecraftLogo()
    // removeEditionBadge()

    // Clear all buttons already on screen
    // clearAllButtons()

    label {
        position {
            x = 2
            y { it - 20 }
        }

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("Experience²")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Color orightf the text, default is 0xFFFFFF
        color = 0xFFFFFF
        // Whether the label has a shadow, default is false
        shadow = true
        // Mouse Click Function, default is nothing, here's a list of options
        onClicked = url("https://github.com/laxotor/Experience2")
    }

    
}