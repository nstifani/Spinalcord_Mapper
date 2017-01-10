# Spinalcord_Mapper v1.0
2016-12-17
Author: Nicolas Stifani nstifani@gmail.com

This is a plugin for ImageJ intented for Processing, Manual Registration and cell count of spinal cord images.
It requires ImageJ 1.50 and above.

To install it:
- Download the Spinalcord_Mapper.jar
- Save it into your Folder ImageJ\plugins\
- Restart ImageJ
You will find the function into ImageJ Menu > Plugins > Spinalcord Mapper

To do List
Display the Channel tool in the Manual Cell detection

General Requirements
−	Image Files should be TIF, named with the following nomenclature
DATE_ANIMAL_GROUP_OTHER_VARIABLES_SEPARATED_BY_UNDERSCORE.TIF
−	The files should contain only one “.” character for the file extension.
−	Each variable should be separated by a “_”
−	Do not use _ unless for separating variables
−	Do not use special characters such as ~!@#$%^&*”’;:<>?/\|


1.1	Spinal cord Registration with Spinalcord Mapper
1.1.1.1	Installation
−	TIF files should be in a single folder
−	Images should be aligned so the dorso-ventral axis is roughly vertical
−	Download Spinalcord_Mapper.jar from https://github.com/nstifani/Spinalcord_Mapper
−	Save Spinalcord_Mapper.jar in your ImageJ/plugins folder and restart ImageJ
1.1.1.2	Registration
−	Open ImageJ
−	Select Plugins/Spinalcord Mapper/SC Registration
−

Select the folder containing the TIF files
−	Click sequentially on the Central Canal, the Dorsal Edge of the Right side, the
Lateral Edge of the Right side, the Ventral Edge of the Right side, the Ventral Edge of the
Left Side, the Lateral Edge of the Left side, the Dorsal Edge of the Left side
−	Spinal cord Mapper will save for each image:
o	a TIF file with the Registration Points as an overlay
o	the Registration Points as a Region of Interest ZIP file
o	the X and Y the Registration Points Coordinates in a CSV File
