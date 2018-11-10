# MagicAI
## Goal of the Project
The Magic: the Gathering trading card game is known to be a complex game, and one of the phases of the game, combat, involves complex decision-making. Similarly to chess, it can involve predicting decisions an opponent can make. In this regard, a player must "learn" the battlefield, processing and reprocessing possible decisions. This project aims to simulate the thought process.

## How combat works to the leyman
In Magic, players control creatures that fight for them. The turn player chooses which creatures he or she attacks with, if any, and the opposing player chooses which of their creatures block any attacking creatures. Each paired off set of creatures deal damage to each other and the unblocked creatures, if any, deal their damage to the opposing player.

## Factors the process must account for
When making an attack, a player must weigh the gains and losses of an attack. Certain decisions may cause them to lose creatures for little value. The "AI" attempts to account for this, making the most value-oriented decision when choosing which creatures to attack with.

## Decisions it makes
The application simply returns the creatures it would attack with from among the creatures you control in a given scenario. It considers possible blocks and what the player may do on their turn, and whether attacks on the current turn may cause a loss based on how much damage each player can take.




## Implementable creatures to test application

Terrain Elemental 2 3/2 4
Alpine Grizzly 3 4/2 2
Centaur Courser 3 3/3 2
Colossodon Yearling 3 2/4 2
Broodhunter Wurm 4 4/3 4
Feral Krushok 5 5/4 2
Thornhide Wolves 5 4/5 2
Tusked Colossodon 6 6/5 2

Falkenrath Reaver 2 2 2 4
Frenzied Raptor 4 2 3 4
Hulking Devil 5 2 4 2
Hyena Pack 3 4 4 2
Earth Elemental 4 5 5 4

## Possible spell-based consideration for future version
name cmc #

Larger than Life [spell] 4
Explore [spell] 4
Wild Instincts [spell] 2
Spitting Earth [spell] 2 4
Blazing Volley [spell] 1 2
Arrow Storm [spell] 5 4
Pillar of Flame [spell] 1 4
Incendiary Flow [spell] 2 4
