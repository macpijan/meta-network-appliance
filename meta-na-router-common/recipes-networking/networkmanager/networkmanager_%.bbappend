FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
  file://unmanaged.conf \
"

PACKAGECONFIG_append = " wifi modemmanager"

do_install_append() {
  install -m 0644 ${WORKDIR}/unmanaged.conf ${D}${sysconfdir}/NetworkManager/conf.d/
}
