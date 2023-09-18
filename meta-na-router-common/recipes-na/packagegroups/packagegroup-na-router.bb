SUMMARY = "Network Appliance - Router packagegroup"
DESCRIPTION = "Network Appliance - Router packagegroup"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = " \
  ${PN}-common \
  ${PN}-firmware \
  ${PN}-utils \
"

RDEPENDS:${PN}-common = " \
  ${PN}-firmware \
  ${PN}-utils \
  crda \
  dnsmasq \
  hostapd \
  iperf3 \
  iw \
  na-router-networkd-config \
  usb-modeswitch \
"

RDEPENDS:${PN}-firmware = " \
  linux-firmware-ath9k \
  linux-firmware-ath10k \
"

RDEPENDS:${PN}-utils = " \
  bind-utils \
  coreutils \
  findutils \
  iputils-ping \
  iputils-tracepath \
  iproute2 \
  less \
  ncurses-terminfo \
  net-tools \
  procps \
  util-linux \
"
