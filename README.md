Kitchensink on OpenShift
=========================

This is the kitchensink JBoss Quickstart app.  You can find more info @ https://docs.jboss.org/author/display/AS71/Kitchensink+quickstart

Running on OpenShift
--------------------

Create an account at http://openshift.redhat.com/

Create a jbossas-7 application

    rhc app create -a kitchensink -t jbossas-7 --from-code git://github.com/openshift/kitchensink-example.git

That's it, you can now checkout your application at:

    http://kitchensink-$namespace.rhcloud.com
