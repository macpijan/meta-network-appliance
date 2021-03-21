SUMMARY = "Network Appliance - WebUI packagegroup"
DESCRIPTION = "Network Appliance - WebUI packagegroup"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = " \
  ${PN}-base \
  ${PN}-docker \
"

RDEPENDS_${PN}-base = " \
  cockpit \
  cockpit-systemd \
  cockpit-shell \
  cockpit-users \
  cockpit-networkmanager \
  cockpit-ws \
  firewalld \
"

RDEPENDS_${PN}-docker = " \
  cockpit-docker \
  docker-ce \
  python3-docker-compose \
"
