FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://hostapd.conf"

do_install:append() {
    rm ${D}${sysconfdir}/hostapd.conf
    install -m 0644 ${WORKDIR}/hostapd.conf ${D}${sysconfdir}
}

SYSTEMD_AUTO_ENABLE:${PN} = "enable"
