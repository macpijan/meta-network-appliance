SUMMARY = "router - networkd bridge configuration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = " \
    # The bridge configuration files can be common in most cases
    file://10-br0.netdev \
    file://10-bridge-ethernet.network \
    # The LAN and WAN networks are platform-specific and can be replaced in the
    # bbappend file. The examples are for PCengines APU2 platform.
    file://10-lan.network \
    file://10-wan.network \
"

do_install() {
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/*.network ${D}${sysconfdir}/systemd/network/
    install -m 0644 ${WORKDIR}/*.netdev ${D}${sysconfdir}/systemd/network/
}
