FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
  file://unmanaged.conf \
"

PACKAGECONFIG:append = " wifi modemmanager"

do_install:append() {
  install -m 0644 ${WORKDIR}/unmanaged.conf ${D}${sysconfdir}/NetworkManager/conf.d/
}
