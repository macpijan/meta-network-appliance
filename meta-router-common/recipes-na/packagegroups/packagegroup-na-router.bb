SUMMARY = "Network Appliance - Router packagegroup"
DESCRIPTION = "Network Appliance - Router packagegroup"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = " \
  ${PN}-common \
  ${PN}-firmware \
"

RDEPENDS_${PN}-common = " \
  ${PN}-firmware \
  dnsmasq \
  hostapd \
"

RDEPENDS_${PN}-firwmare = " \
  linux-firmware-ath9k \
  linux-firmware-ath10k \
"
