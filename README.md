Struts2 JBoss EAR example
=================

Simple demo how to create JBoss based ear application with Struts 2 and Convention plugin - was tested with JBoss 5 and 7

It specify acctions in two places:
- struts2-ear-ejb module
- struts2-ear-jar module

but such configuration will not work as you must include struts2-core in struts2-ear-web module to allow access to struts-tags.tld

If your actions don't have a presentation layer which base on JSP tags, thus will work. In other case you must specify your actions in struts2-ear-web module or extract struts-tags.tld into WEB-INF

Published under [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
