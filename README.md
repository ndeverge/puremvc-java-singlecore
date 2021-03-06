# PureMVC Java port by Frederic Saunier (<frederic.saunier@puremvc.org>)
 
 Adapted from sources of different authors
 
 PureMVC - Copyright(c) 2006-10 Futurescale, Inc., Some rights reserved.<br>
 Your reuse is governed by the Creative Commons Attribution 3.0 License

    --------------------------------------------------------------------------
    Release Date: 18/04/2012
    Platform: Java
     Version: 1
    Revision: 2
      Author: 
            : Frederic Saunier <frederic.saunier@puremvc.org>
            : Donald Stinchfield <donald.stinchfield@puremvc.org>
            : Thomas Schuessler <thomas.schuessler@puremvc.org>
            : Michael Watzek <mwa.tech@spree.de>
            : Philipp Hemker <phe@startext.de>
            : Jan Grimmer <Jan.Grimmer@cimt-ag.de>
            : Nicolas Deverge <ndeverge@ekito.fr>
     License: Creative Commons Attribution 3.0 License
    --------------------------------------------------------------------------

## Maven dependency

Add this in your ``pom.xml`` file:

    <dependencies>
        ...
        <dependency>
	    <groupId>org.puremvc</groupId>
	    <artifactId>puremvc-java</artifactId>
	    <version>1.2-SNAPSHOT</version>
        </dependency>
    </dependencies>

    <repositories>
        ...
        <repository>
            <id>ekito-public-snapshots</id>
            <url>https://raw.github.com/Ekito/maven-repo/master/snapshots</url>
        </repository>
        <repository>
            <id>ekito-public-releases</id>
            <url>https://raw.github.com/Ekito/maven-repo/master/releases</url>
        </repository>
    </repositories>

## Continuous integration

The project is automatically built by [BuildHive](https://buildhive.cloudbees.com/job/ndeverge/job/puremvc-java-singlecore/):

[![Build Status](https://buildhive.cloudbees.com/job/ndeverge/job/puremvc-java-singlecore/badge/icon)](https://buildhive.cloudbees.com/job/ndeverge/job/puremvc-java-singlecore/)

## History

1.2 - Moved to Maven.

1.1 - Now Proxy.onRemove() method is called when removing a proxy.

1.0 - The framework has been adapted from the multicore version. It fixes the
      lack off onRegister, onRemove methods of Mediators and Proxy classes and
      improves GWT compatibility. It also has been tested successfully against
      Android 2.2. 

0.3 - Junit tests from Futurescale have been added.  build.xml file was
      refactored to make easier to build modules.  This is mostly an
      administrative release
      
0.2 - Current version is partially compatible with AS3 version 2.0.1, 
     still needs onRegister/onRemove in Mediators and Proxies, and 
 	  a few other things. Added JavaDocs - CLH

0.1 - Created initial file structure and added license and version files - CLH