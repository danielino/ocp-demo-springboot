
openshift-newbuild:
	oc new-build --strategy docker --binary --name spboot-demo

openshift-build:
	oc start-build spboot-demo --from-dir . --follow

openshift-deploy:
	oc new-app spboot-demo